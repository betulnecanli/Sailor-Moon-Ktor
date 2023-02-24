# <h1 align="center">Sailor Moon Server</h1>

<p align="center">
<img src="https://github.com/betulnecanli/SailorMoonServer/blob/master/banner/sailorbnnr.png?raw=true"/>
</p>

<p align="center">  
🌙 This project shows usage of Kotlin library ktor: Simple REST Server exposing JSON API for Sailor Moon entities. 🌙
</p>
</br>

# <h2 align="center">How to run?</h2>
<p align="center"> 
After the download the project, you can open it with Intellij Idea. 
You can run the project on Application.kt file.
This server responds at http://127.0.0.1:8080.
You can use Postman for requests and responses.
</p>


# <h2 align="center">Endpoints</h2>
## Show All Characters 
- Method : GET
- Endpoint : /sailormoon/characters
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
## Search Characters
- Method : GET
- Endpoint : /sailormoon/characters/search?name=
- Request : localhost:8080/sailormoon/characters/search?name=mars
- Response : 
```json 
...
{
    "success": true,
    "message": "OK",
    "prevPage": null,
    "nextPage": null,
    "sailorMoon": [
        {
            "id": 2,
            "name": "Sailor Mars",
            "image": "/images/mars.jpg",
            "realName": "Rei Hino",
            "birthday": "April 17",
            "age": 16,
            "species": "Human",
            "heartRate": 5.0,
            "about": "Rei Hino (火野 レイ, Hino Rei) is the civilian identity and present-day incarnation of Sailor Mars (セーラーマーズ, Seera Maazu). She is a shrine priestess who lives at Hikawa Shrinewith her Grandfather and the crows Phobos and Deimos in the manga."
        }
    ],
    "lastUpdated": null
}
...
```


