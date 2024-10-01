## Grails 6.2.0 app utilizing spring security REST

Run `./startup.sh` to build mysql database and app through docker compose

A test user, role and activity data is added in bootstrap.

API is available through `http://localhost:10090/api/activity`

Initially you'll get something like:

```
{
    "timestamp": 1727766541361,
    "status": 403,
    "error": "Forbidden",
    "path": "/api/activity"
}
```
Get a token by POSTing to `http://localhost:10090/api/login`

```
{
    "username": "user1",
    "password": "pwd1"
}
```

Then add header named X-Auth-Token to `/activity` request with value of access_token returned from login, request should now return activity data.
