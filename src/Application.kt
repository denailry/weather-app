import com.searcher.Searcher
import com.component.Attribute
import com.component.Compositor
import com.inputhandler.InputHandler
import com.inputhandler.LocationHandler

fun main(args: Array<String>) {
  val searcher = buildSearcher()
  val handler = InputHandler.new().addHandler(LocationHandler(searcher))

  startReceivingInput(handler)
}

fun startReceivingInput(handler: InputHandler) {
  var input: String? = null

  while (input != "Q") {
    handler.handle(input?.split(" "))
    input = readLine()
  }
}

fun buildSearcher() : Searcher {
  val searcher = Searcher()

  buildLocationForSearcher("jakarta", searcher)
  buildLocationForSearcher("bangalore", searcher)

  return searcher
}

fun buildLocationForSearcher(location: String, searcher: Searcher) {
  val days = arrayListOf("monday", "tuesday", "wednesday", "thursday", "friday").toCollection(ArrayList())
  val temperatures = arrayListOf("20C", "25C", "22C", "30C", "23C").toCollection(ArrayList())

  for (i in 0..4) {
    val day = days.get(i)
    val temperature = temperatures.get(i)
    val weather = ArrayList<Pair<String, String>>()

    weather.add(Pair("location", location))
    weather.add(Pair("day", day))
    weather.add(Pair("temperature", temperature))

    registerWeather(weather, searcher)
  }
}

fun registerWeather(weathers: ArrayList<Pair<String, String>>, searcher: Searcher) {
  var compositor = Compositor()

  for (weather in weathers) {
    val attribute = Attribute(compositor, weather.component1(), weather.component2())
    compositor.compose(attribute)
    searcher.register(attribute)
  }
}
