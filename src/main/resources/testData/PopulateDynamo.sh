# You need to run `aws configure` on your local machine before running this script. Fill in the following fields as shown here:
# - AWS Access Key ID [None]: fakeMyKeyId
# - AWS Secret Access Key [None]: fakeSecretAccessKey
# - Default region name [None]: eu-west-2
# - AWS Access Key ID [None]: <Leave Blank>

aws dynamodb create-table --endpoint-url http://localhost:8000 --table-name User --attribute-definitions AttributeName=Id,AttributeType=S --key-schema AttributeName=Id,KeyType=HASH --provisioned-throughput ReadCapacityUnits=5,WriteCapacityUnits=5

aws dynamodb batch-write-item --endpoint-url http://localhost:8000 --request-items file://ExampleUser.json