curl -v -H "Content-Type: application/json" -X POST -d \
'{"transactionId":"1234567", "cardNo":"1234567890","channelId":"1000", "upc":"upc3", "loadValue":"110.00", "cardStatus":"ACT", "remark":"comments" }' \
http://localhost:8080/transaction


curl -v -H "Content-Type: application/json" -X GET http://localhost:8080/transaction?id=1234567

curl -v -H "Content-Type: application/json" -X DELETE http://localhost:8080/transaction?id=1234567