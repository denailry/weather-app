package com.component

interface Component {
  fun compose(component: Component)
  fun root() : Component
  override fun toString() : String
}
