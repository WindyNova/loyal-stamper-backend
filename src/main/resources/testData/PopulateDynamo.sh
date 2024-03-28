# You need to run `aws configure` on your local machine before running this script. Fill in the following fields as shown here:
# - AWS Access Key ID [None]: fakeMyKeyId
# - AWS Secret Access Key [None]: fakeSecretAccessKey
# - Default region name [None]: eu-west-2
# - AWS Access Key ID [None]: <Leave Blank>

aws dynamodb batch-write-item --endpoint-url http://localhost:8000 --request-items file://ExampleUser.json