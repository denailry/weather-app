package com.component

class Attribute(private var compositor: Component, val id: String, var value: String) : Component {
  override fun compose(component: Component) {
    compositor.compose(component)
  }

  override fun root() : Component {
    return compositor
  }

  override fun toString() : String {
    return id + ": " + value
  }
}
