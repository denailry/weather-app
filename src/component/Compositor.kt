package com.component

class Compositor : Component {
  private val components: ArrayList<Component> = ArrayList()
  var upperCompositor: Compositor? = null

  override fun compose(component: Component) {
    components.add(component)
  }

  override fun root() : Component {
    if (upperCompositor == null) {
      return this
    }

    return upperCompositor!!
  }

  override fun toString() : String {
    var result = ""

    for (component in components) {
      result += component.toString() + "\n"
    }

    return result;
  }
}
