package io.github.justfoxx.example

import io.github.justfoxx.teacup.v1.utils.Mod

internal val mod = Mod("example")

@Suppress("unused")
fun init() {
    mod.logger.info("Hello, World!")
}

@Suppress("unused")
fun preInit() {
    mod.logger.info("Pre-Initialization")
}