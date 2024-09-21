package com.singularity.memories

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform