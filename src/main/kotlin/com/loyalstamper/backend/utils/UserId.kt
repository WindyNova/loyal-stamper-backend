package com.loyalstamper.backend.utils

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey
import java.io.Serializable

@DynamoDBDocument
data class UserId(

    @field:DynamoDBHashKey
    var username: String = "", // TODO - Var?

    //@field:DynamoDBRangeKey
    //var lastName: String? = null

) : Serializable
