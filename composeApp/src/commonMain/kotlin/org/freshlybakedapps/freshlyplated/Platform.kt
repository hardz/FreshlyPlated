package org.freshlybakedapps.freshlyplated

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform