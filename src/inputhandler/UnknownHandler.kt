package com.inputhandler

class UnknownHandler : InputHandler() {
  override fun handle(args: List<String>?) {
    println("--- Unknown Command ---")
  }
}