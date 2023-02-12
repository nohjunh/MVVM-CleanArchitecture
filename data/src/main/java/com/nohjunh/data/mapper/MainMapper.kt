package com.nohjunh.data.mapper

import com.nohjunh.data.remote.model.DataLoveResponse
import com.nohjunh.domain.model.DomainLoveResponse

object MainMapper {
    fun loveMapper (
        dataResponse : DataLoveResponse?
    ) : DomainLoveResponse? {
        return if (dataResponse != null) {
            DomainLoveResponse(
                fname = dataResponse.fname,
                percentage = dataResponse.percentage,
                sname = dataResponse.sname,
                result = dataResponse.result
            )
        } else dataResponse
    }
}