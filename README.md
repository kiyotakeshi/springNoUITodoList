# Simple Todo item register

- no UI

## Confirm application function

You can check REST API function.
I reccomend to use [Postman](https://www.postman.com/).

**The following steps after building and running app**

- GET
    - There is no record and get an empty array

```shell
$ curl -X GET \
  http://localhost:8080/todo \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 30' \
  -H 'Content-Type: application/json' \
  -H 'Host: localhost:8080' \
  -H 'cache-control: no-cache'
[]

```

- POST
    - two records post and to check these

```shell
$ curl -X POST \
  'http://localhost:8080/todo?=' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 75' \
  -H 'Content-Type: application/json' \
  -H 'Host: localhost:8080' \
  -H 'cache-control: no-cache' \
  -d '{
    "id": 1,
    "title": "Title 1",
    "done": false
}'
{"id":1,"title":"Title 1","done":false}

$ curl -X POST \
  'http://localhost:8080/todo?=' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 75' \
  -H 'Content-Type: application/json' \
  -H 'Host: localhost:8080' \
  -H 'cache-control: no-cache' \
  -d '{
    "id": 2,
    "title": "Title 2",
    "done": false
}'
{"id":2,"title":"Title 2","done":false}

# two records exsists and I can get these
$ curl -X GET \
  http://localhost:8080/todo \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 30' \
  -H 'Content-Type: application/json' \
  -H 'Host: localhost:8080' \
  -H 'cache-control: no-cache'
[{"id":1,"title":"Title 1","done":false},{"id":2,"title":"Title 2","done":false}]
```

- DELETE

```shell
$ curl -X DELETE \
  http://localhost:8080/todo/1 \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 0' \
  -H 'Host: localhost:8080' \
  -H 'cache-control: no-cache'

# check exit status
$ echo $?
0

# check id 1 record is deleted
$ curl -X GET \
  http://localhost:8080/todo \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 30' \
  -H 'Content-Type: application/json' \
  -H 'Host: localhost:8080' \
  -H 'cache-control: no-cache'
[{"id":2,"title":"Title 2","done":false}]
```
