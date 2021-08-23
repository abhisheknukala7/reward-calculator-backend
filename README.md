# reward-calculator-backend
# REST API
## The API's to the reward app are described below

### Request
/rewards/customers

### Response
[
   {
      "id":1,
      "name":"Jane"
   },
   {
      "id":2,
      "name":"Doe"
   },
   {
      "id":3,
      "name":"Tom"
   }
]

### Request
/rewards/customer/{customerId}/{year}/{month}

### Response
{
   "transactions":[
      {
         "id":6,
         "customerId":1,
         "transactionDate":"2020-01-17T15:00:10.000+0000",
         "total":3632,
         "points":7114
      },
      {
         "id":8,
         "customerId":1,
         "transactionDate":"2020-01-17T17:00:10.000+0000",
         "total":626,
         "points":1102
      }
   ],
   "totalPoints":8216
}
