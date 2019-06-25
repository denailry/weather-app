package com.inputhandler

abstract class InputHandler {
  protected var nextHandler: InputHandler? = null

  companion object {
    fun new() : InputHandler {
      return UnknownHandler().
        addHandler(SkipHandler())
    }
  }

  fun addHandler(handler: InputHandler) : InputHandler {
    handler.nextHandler = this
    return handler
  }

  abstract fun handle(args: List<String>?)
}