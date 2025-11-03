package dev.havlicektomas.chirp.domain.exception

class InvalidCredentialsException: RuntimeException(
    "The entered credentials aren't valid"
)