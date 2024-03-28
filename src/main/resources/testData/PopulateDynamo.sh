# You need to run `aws configure` on your local machine before running this script. Fill in the following fields as shown here:
# - AWS Access Key ID [None]: fakeMyKeyId
# - AWS Secret Access Key [None]: fakeSecretAccessKey
# - Default region name [None]: eu-west-2
# - AWS Access Key ID [None]: <Leave Blank>

aws dynamodb list-tables --endpoint-url http://localhost:8000 --region eu-west-2

aws dynamodb create-table --table-name User --attribute-definitions AttributeName=Id,AttributeType=S AttributeName=Username,AttributeType=S AttributeName=Email,AttributeType=S AttributeName=Password,AttributeType=S AttributeName=LoyaltyCards,AttributeType=S --key-schema AttributeName=Id,KeyType=HASH


aws dynamodb batch-write-item --request-items file://ExampleUser.json