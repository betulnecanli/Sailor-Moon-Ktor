# SailorMoonServer

This project shows usage of Kotlin library ktor: Simple REST Server exposing JSON API for Sailor Moon entities.

## Show Characters
- Method : GET
- Request : localhost:8080/sailormoon/characters
```json 
...
{
    "success": true,
    "message": "OK",
    "prevPage": null,
    "nextPage": 2,
    "sailorMoon": [
        {
            "id": 1,
            "name": "Sailor Moon",
            "image": "/images/moon.jpg",
            "realName": "Usagi Tsukino",
            "birthday": "June 30th",
            "age": 16,
            "species": "Human"
        },
        {
            "id": 2,
            "name": "Sailor Mars",
            "image": "/images/mars.jpg",
            "realName": "Rei Hino",
            "birthday": "April 17",
            "age": 16,
            "species": "Human"
        },
        {
            "id": 3,
            "name": "Sailor Mercury",
            "image": "/images/mercury.jpg",
            "realName": "Ami Mizuno",
            "birthday": "September 10",
            "age": 16,
            "species": "Human"
        }
    ]
}
...
```


## Search Characters
- Method : GET
- Request : localhost:8080/sailormoon/characters/search?name=""

