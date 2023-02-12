package com.nohjunh.domain.repository

import com.nohjunh.domain.model.DomainLoveResponse
import com.nohjunh.domain.utils.RemoteErrorEmitter

interface MainRepository {
    suspend fun checkLoveCalculator(
        remoteErrorEmitter: RemoteErrorEmitter,
        host : String,
        key : String,
        mName : String,
        wName : String
    ) : DomainLoveResponse?
}