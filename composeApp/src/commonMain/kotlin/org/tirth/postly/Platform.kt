package org.tirth.postly

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform