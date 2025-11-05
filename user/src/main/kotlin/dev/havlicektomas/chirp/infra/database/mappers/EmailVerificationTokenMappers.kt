package dev.havlicektomas.chirp.infra.database.mappers

import dev.havlicektomas.chirp.domain.model.EmailVerificationToken
import dev.havlicektomas.chirp.infra.database.entities.EmailVerificationTokenEntity

fun EmailVerificationTokenEntity.toEmailVerificationToken(): EmailVerificationToken {
    return EmailVerificationToken(
        id = id,
        token = token,
        user = user.toUser()
    )
}