# <h1 align="center">Sailor Moon Server</h1>

<p align="center">
<img src="https://github.com/betulnecanli/SailorMoonServer/blob/master/banner/sailorbnnr.png?raw=true"/>
</p>

<p align="center">  
🌙 This project shows usage of Kotlin library ktor: Simple REST Server exposing JSON API for Sailor Moon entities. 🌙
</p>
</br>

# <h2 align="center">Endpoints</h2>
## Show All Characters 
- Method : GET
- Request : localhost:8080/sailormoon/characters
- Response : 
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
## Show Character Details
- Method : GET
- Request : localhost:8080/sailormoon/characters?name="sailormars"
- Response : 
```json 
...

...
```


## Search Characters
- Method : GET
- Request : localhost:8080/sailormoon/characters/search?name=""
- Response : 
```json 
...

...
```
# <h2 align="center">How to run?</h2>
