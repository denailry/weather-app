package com.inputhandler

class SkipHandler : InputHandler() {
  override fun handle(args: List<String>?) {
    if (args != null && args.size != 0) {
      nextHandler?.handle(args)
    }
  }
}