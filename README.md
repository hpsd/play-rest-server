#Play REST API

    
It serves up a dummy User   
    

    
##To retrieve a User supply any id value in the link below and a dummy user will be retrieved
    

GET http://localhost:9000/v1/users/{id}  


    
##To simulate 404 do :
    
GET http://localhost:9000/v1/users/99  

##Sample JSON 

GET http://localhost:9000/v1/users/1    

```json
{
  "id": 1,
  "name": "name__from_server_1",
  "email": "email_from_1@server.com",
  "address1": "address_line_1_from_server_1",
  "address2": "address_line_2__from_server_1",
  "townCity": "town__from_server_1",
  "postCode": 1001,
  "country": "country_from_server_1",
  "telephoneList": [
    "phone_1_from_server_1",
    "phone_2_from_server_1",
    "phone_3_from_server_1"
  ]
}
```