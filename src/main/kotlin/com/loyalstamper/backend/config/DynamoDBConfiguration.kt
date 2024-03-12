package com.loyalstamper.backend.config

import cn.hutool.core.util.StrUtil
import com.amazonaws.auth.AWSCredentials
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

@Component
@Configuration
@EnableDynamoDBRepositories
class DynamoDBConfiguration {
//    https://blog.csdn.net/achenyuan/article/details/81332882
companion object{
    private const val AMAZONDYNAMODBENDPOINT: String = ""


    private const val AMAZONAWSACCESSKEY: String=""

    private const val AMAZONAWSSECRETKEY: String=""  }
@Autowired
    fun setMyShit(
    @Value("\${amazon.dynamodb.endpoint}") amazonDynamoDBEndpoint: String= AMAZONDYNAMODBENDPOINT,
    @Value("\${amazon.aws.accesskey}") amazonAWSAccessKey: String= AMAZONAWSACCESSKEY,
    @Value("\${amazon.aws.secretkey}")amazonAWSSecretKey: String= AMAZONAWSSECRETKEY,

    ) {
      DynamoDBConfiguration
    }


    @Bean
    fun amazonDynamoDB(): AmazonDynamoDB {
        val amazonDynamoDB
                : AmazonDynamoDB = AmazonDynamoDBClient(amazonAWSCredentials())

        if (!StrUtil.isEmpty(AMAZONDYNAMODBENDPOINT)) {
            amazonDynamoDB.setEndpoint(AMAZONDYNAMODBENDPOINT)
        }

        return amazonDynamoDB
        }
        @Bean
        fun amazonAWSCredentials(): AWSCredentials {
            return BasicAWSCredentials(
                AMAZONAWSACCESSKEY, AMAZONAWSSECRETKEY
            )
        }
    }
