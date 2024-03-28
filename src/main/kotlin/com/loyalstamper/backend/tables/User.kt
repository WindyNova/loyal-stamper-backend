package com.loyalstamper.backend.tables

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable
import java.util.*


@DynamoDBTable(tableName = "User")
class User(@DynamoDBAttribute val username: String?, @DynamoDBAttribute val email: String?, @DynamoDBAttribute val password: String?) {
    @DynamoDBAutoGeneratedKey
    @DynamoDBHashKey
    private var id: String? = null // TODO - Make these vals

    //    @get:DynamoDBAttribute TODO - Add when ready to figure out embedded JSON
//    var loyaltyCards: String? = null

    override fun toString(): String {
        return "User [id=$id, username=$username, email=$email, password=$password]"
    }

    override fun hashCode(): Int {
        return Objects.hash(id, username, email, password)
    }

    override fun equals(obj: Any?): Boolean {  // TODO - Change param type from Any?
        if (this === obj) return true
        if (obj == null) return false
        if (javaClass != obj.javaClass) return false
        val other = obj as User
        return arrayOf<Any?>(id, username, email, password).contentDeepEquals(
            arrayOf<Any?>(
                other.id,
                other.username,
                other.email,
                other.password
            )
        )
    }
}