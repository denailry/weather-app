package com.inputhandler

import com.searcher.Searcher
import com.component.Attribute
import com.component.Compositor

class LocationHandler(private val searcher: Searcher) : InputHandler() {
  override fun handle(args: List<String>?) {
    if (args?.get(0) == "location") {
      val locations = searcher.search(args.get(0), args.get(1))

      if (locations != null) {
        for (location in locations) {
          val compositor = location.root()
          val result = compositor.toString()
          println(result)
        }
      }
    } else {
      nextHandler?.handle(args)
    }
  }
}