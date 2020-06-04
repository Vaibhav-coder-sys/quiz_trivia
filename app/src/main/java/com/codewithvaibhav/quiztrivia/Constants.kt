package com.codewithvaibhav.quiztrivia

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList= ArrayList<Question>()
        val que1=Question(
            1,
            "Which of these streaming services produced \"Sacred Games\"?",
            R.drawable.f,
            "Amazon Prime",
            "Netflix",
            "Hotstar",
            "Voot",
            2)

        questionsList.add(que1)

        val que2=Question(
            2,
            "What is this brand ?",
            R.drawable.reebok1,
            "Nike",
            "Rebook",
            "Champion",
            "ASICS",
            2)

        questionsList.add(que2)

        val que3=Question(
            3,
            "Which of these companies is formally referred to as Hewlett-Packard Company ?",
            R.drawable.hp,
            "hp",
            "Dell",
            "Lenovo",
            "Asus",
            1)

        questionsList.add(que3)

        val que4=Question(
            4,
            "Which is this brand ?",
            R.drawable.paypal,
            "Pandora",
            "Paypal",
            "Petro China",
            "Paramount",
            2)

        questionsList.add(que4)

        val que5=Question(
            5,
            "Which restraunt is known for their donuts ?",
            R.drawable.donut1,
            "McDonald's",
            "Cinnabon",
            "New York Fries",
            "Dunkin' Donuts",
            4)

        questionsList.add(que5)

        val que6=Question(
            6,
            "What is this brand ?",
            R.drawable.nike,
            "Under Armour",
            "Air Jordan",
            "Addidas",
            "Nike",
            4)

        questionsList.add(que6)

        val que7=Question(
            7,
            "Which company likely produced this sandwich?",
            R.drawable.subway,
            "Arby's",
            "Subway",
            "Wendy's",
            "Quiznos",
            2)

        questionsList.add(que7)

        val que8=Question(
            8,
            "Which car manufacturer of luxury sports cars is based in Italy ?",
            R.drawable.car,
            "Porche",
            "Lamborghini",
            "Chervolet",
            "Audi",
            2)

        questionsList.add(que8)

        val que9=Question(
            9,
            "What is the name of this candy ?",
            R.drawable.candy,
            "Skittles",
            "Smarties",
            "Rolo",
            "M&M's ",
            4)

        questionsList.add(que9)

        val que10=Question(
            10,
            "The company Nestle is also known for selling what product ?",
            R.drawable.nestle,
            "Scooters",
            "Alcohol",
            "Baby Food",
            "Chicken",
            3)

        questionsList.add(que10)

        return questionsList


    }

    fun getQuestions1():ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            11,
            "Which of the following anti-satellite missile is tested by India on 27 March, 2019?",
            R.drawable.miscell,
            "Mission Antriksh",
            "Mission Gagan",
            "Mission Shakti",
            "Mission Destruction",
            3
        )

        questionsList.add(que1)

        val que2=Question(
            12,
            "Which state of India became first to reserve a government job for HIV positive candidates?",
            R.drawable.hiv,
            "Uttar Pradesh",
            "Mizoram",
            "Kerala",
            "Maharashtra",
            3)

        questionsList.add(que2)

        val que3=Question(
            13,
            "Which of the following creature is linked with the moon pollution?",
            R.drawable.moon,
            "Tardigrades",
            "Water Bears",
            "Both A and B",
            "Neither A nor B",
            3)

        questionsList.add(que3)

        val que4=Question(
            14,
            "Exposure to which light may accelerate aging?",
            R.drawable.aging,
            "Blue Light",
            "Red Light",
            "Yellow Light",
            "None of the above",
            1)

        questionsList.add(que4)

        val que5=Question(
            15,
            "In which continent scientists have found particles of rare isotope of Iron?",
            R.drawable.iron,
            "Africa",
            "Antarctica",
            "Europe",
            "Australia",
            2)

        questionsList.add(que5)

        val que6=Question(
            16,
            "Chandrayaan-2 Mission was launched by which vehicle?",
            R.drawable.chandrayaan,
            "GSLV MkIII",
            "PSLV C11",
            "GSLV F11",
            "PSLV C45",
            1)

        questionsList.add(que6)

        val que7=Question(
            17,
            "Zika virus was named after the Zika Forest of which country?",
            R.drawable.zika,
            "Nigeria",
            "Angola",
            "Nicaragua",
            "Uganda",
            3)

        questionsList.add(que7)

        val que8=Question(
            18,
            "Which among the following country first reached the ‘Dark Side’ of the Moon?",
            R.drawable.dark,
            " India",
            "USA",
            "China",
            "Russia",
            3)

        questionsList.add(que8)

        val que9=Question(
            19,
            "Which UN organisation became the first to accept a donation in cryptocurrencies?",
            R.drawable.cryptocurrency,
            "IFAD",
            "UNICEF",
            "Both A and B",
            "Neither A and B",
            3)

        questionsList.add(que9)

        val que10=Question(
            20,
            "Which of these are planetary storms?",
            R.drawable.planetary,
            "Jupiter's Great Red Spot",
            "Sun's Solar Flares",
            "Saturn's Great White Storm",
            " Both A and C",
            4)

        questionsList.add(que10)

        return questionsList
    }


    fun getQuestions2():ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            21,
            "Can you name this landmark ?",
            R.drawable.places_grandcanyon,
            "Sahara Desert",
            "Copper Canyon",
            "Grand Canyon",
            "Great Dune of Pyla",
            3
        )

        questionsList.add(que1)

        val que2 = Question(
            22,
            "Can you name this city ?",
            R.drawable.places_newyork,
            "San Francisco",
            "New York",
            "Chicago",
            "Los Angeles",
            2
        )

        questionsList.add(que2)

        val que3 = Question(
            23,
            "What is the capital and most populated city in France ?",
            R.drawable.places_france,
            "Lyon",
            "Marseille",
            "Paris",
            "Bordeaux",
            3

        )
        questionsList.add(que3)

        val que4 = Question(
            24,
            "Can you name this city ?",
            R.drawable.places_sydney,
            "Prague",
            "Sydney",
            "Barcelona",
            "Moscow",
            2
        )
        questionsList.add(que4)

        val que5 = Question(
            25,
            "What is the proper name for Northern Lights ?",
            R.drawable.places_northernlights,
        "Constellation Illumination",
            "Paricutin",
            "Aurora Borealis",
            "Polaris Ilumis",
            3
        )
        questionsList.add(que5)

        val que6 = Question(
            26,
            "Can you name this landmark in Paris ?",
            R.drawable.places_arcdetriomphe,
            "Victory Gate",
            "Arc de Triomphe",
            "Arc of Cinquantenaire",
            "Rua Augusta Arch",
            2
        )
        questionsList.add(que6)

        val que7 = Question(
            27,
            "What city is also known as \"The Theme Park Capital of World\"?",
            R.drawable.places_orlando,
            "Orlando",
            "San Francisco",
            "Miami",
            "San Diego",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            28,
            "What is the name of official residence of the Pope?",
            R.drawable.places_pope,
            "Basilique Notre Dame",
            "Sistine Chapel",
            "Westminster Abbey",
            "St.Peter's Abbey",
            2
        )
        questionsList.add(que8)

        val que9 = Question(
            29,
            "Can you name this landmark in Rome, Italy ?",
            R.drawable.places_trevifountain,
            "Trevi Fountain",
            "The Fountain of Wealth",
            "The Buckingham Fountain",
            "The Archibald Fountain",
            1
        )
        questionsList.add(que9)

        val que10 = Question(
            30,
            "What is also called Salt Sea ?",
            R.drawable.places_saltsea,
            "Dead Sea",
            "Sea of Galilee",
            "Gulf of Aqaba",
            "Haifa Bay",
            1
        )
        questionsList.add(que10)

        return questionsList
    }

    fun getQuestions3():ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            31,
            "Guess the cricketer?",
            R.drawable.cricket_guess,
            "Michael Hussey",
            "Mitchell Marsh",
            "Michael Clarke",
            "Shaun Marsh",
            3
        )
        questionsList.add(que1)

        val que2 = Question(
            32,
            "Harold (“Dickie”) Bird is best known for his career in cricket as:",
            R.drawable.cricket_umpire,
            "Bowler",
            "Umpire",
            "Batsman",
            "Administrator",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            33,
            "Who was the winner of World Cup 2019?",
            R.drawable.cricket_worldcup,
            "England",
            "New Zealand",
            "India",
            "Australia",
            1
        )
        questionsList.add(que3)

        val que4 = Question(
            34,
            "What is the name of Test cricket series played between England and Australia?",
            R.drawable.cricket_ashes,
            "Ashes",
            "Cricket World Cup",
            "Sheffield Shield",
            "Trans-Tasman Trophy",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            35,
            "In which year were the first laws of cricket believed to have been written?",
            R.drawable.cricket_law,
            "1882",
            "1806",
            "1709",
            "1744",
            4
        )
        questionsList.add(que5)

        val que6 = Question(
            36,
            "Which cricketer had scored highest individual score in first-class cricket?",
            R.drawable.cricket_score,
            "Don Bradman",
            " Brian Lara",
            "Lane Hutton",
            "Gary Sobers",
            2
        )
        questionsList.add(que6)

        val que7 = Question(
            37,
            "When was ICC established?",
            R.drawable.cricket_icc,
            "1909",
            "1953",
            "1960",
            "1877",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            38,
            "Where did India play its 1st one day international match?",
            R.drawable.cricket_firstmatch,
            "Lords",
            "Headingley",
            "Taunton",
            "The Oval",
            2
        )
        questionsList.add(que8)

        val que9 = Question(
            39,
            "'Dizzy' is the nickname of what Australian player?",
            R.drawable.cricket_australia,
            "Brett Lee",
            "Glenn McGrath",
            "Adam Gilchrist",
            "Jason Gillespie",
            4
        )
        questionsList.add(que9)

        val que10 = Question(
            40,
            "Where did the 1st ODI match was played in India?",
            R.drawable.cricket_india,
            "Mumbai",
            "Ahmedabad",
            "New Delhi",
            "Kolkata",
            2
        )
        questionsList.add(que10)

        return questionsList
    }

    fun getQuestions4():ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            41,
            "What kind of cheese goes on a Greek salad ?",
            R.drawable.food_greek,
            "Feta",
            "Brie",
            "Gouda",
            "Goat Cheese",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            42,
            "What is NOT another name of hot dog ?",
            R.drawable.food_hotdog,
            "Long hot",
            "Weiner",
            "Tube steak",
            "Frankfurter",
            1
        )
        questionsList.add(que2)

        val que3 = Question(
            43,
            "What type of cocktail is this ?",
            R.drawable.food_martini,
            "Mojito",
            "Tonic Water",
            "Martini",
            "Margarita",
            3
        )
        questionsList.add(que3)

        val que4 = Question(
            44,
            "What is this ?",
            R.drawable.food_quesadilla,
            "Enchilada",
            "Quesadilla",
            "Fajita",
            "Burrito",
            2
        )
        questionsList.add(que4)

        val que5 = Question(
            45,
            "What Chinese cuisine is this from ?",
            R.drawable.food_dimsum,
            "Dim Sum",
            "Manti",
            "Uszka",
            "Perogies",
            1
        )
        questionsList.add(que5)

        val que6 = Question(
            46,
            "What is the most common coffee plant ?",
            R.drawable.food_coffee,
            "Arabica",
            "Espresso",
            "Canephora",
            "Robusta",
            1
        )
        questionsList.add(que6)

        val que7= Question(
            47,
            "What is this ?",
            R.drawable.food_tiramisu,
            "Mocha cake",
            "Vinarterta",
            "Tiramisu",
            "Dobos cake",
            3
        )
        questionsList.add(que7)

        val que8 = Question(
            48,
            "What does it mean if you \"shuck\" an oyster ?",
            R.drawable.food_oyster,
            "You opened its shell",
            "You cleaned the shell",
            "You swallowed it whole",
            "You cooked it in butter",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            49,
            "What type of pasta is this ?",
            R.drawable.food_pasta,
            "Spaghetti",
            "Capellini",
            "Linguine",
            "Fiori",
            3
        )
        questionsList.add(que9)

        val que10 = Question(
            50,
            "What type of tea has the most caffeine ?",
            R.drawable.food_tea,
            "Herbal",
            "Green",
            "Jasmine",
            "Black",
            4
        )
        questionsList.add(que10)

        return questionsList
    }
}