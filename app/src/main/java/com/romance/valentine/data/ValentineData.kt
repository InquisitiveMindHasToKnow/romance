package com.romance.valentine.data

import com.romance.valentine.R

object ValentineData {

    val coupleImages = listOf(
        R.drawable.placeholder_couple_1,
        R.drawable.placeholder_couple_2,
        R.drawable.placeholder_couple_3
    )

    val loveNotes = listOf(
        LoveNote("Every love story is beautiful, but ours is my favorite."),
        LoveNote("I fell in love with you because of a million tiny things you never knew you were doing."),
        LoveNote("You are my today and all of my tomorrows.", "Leo Christopher"),
        LoveNote("In all the world, there is no heart for me like yours.", "Maya Angelou"),
        LoveNote("I love you not because of who you are, but because of who I am when I am with you."),
        LoveNote("You make my heart smile."),
        LoveNote("I choose you. And I'll choose you over and over. Without pause, without a doubt, in a heartbeat. I'll keep choosing you."),
        LoveNote("My favorite place in the world is next to you."),
        LoveNote("I love you more than coffee, and that is saying a lot."),
        LoveNote("You are the best thing that has ever happened to me."),
        LoveNote("If I had a flower for every time you made me smile, I'd have a garden to walk in forever."),
        LoveNote("I still get butterflies even though I have seen you a hundred times."),
    )

    val reasons = listOf(
        Reason(1, "The way you laugh at my terrible jokes"),
        Reason(2, "How you always know exactly what to say"),
        Reason(3, "Your smile that lights up every room"),
        Reason(4, "The way you scrunch your nose when you think"),
        Reason(5, "How you make even ordinary moments feel special"),
        Reason(6, "Your kindness to everyone you meet"),
        Reason(7, "The way you hold my hand"),
        Reason(8, "How you always believe in me"),
        Reason(9, "Your passion for the things you love"),
        Reason(10, "The way you say my name"),
        Reason(11, "How you make me want to be a better person"),
        Reason(12, "Your beautiful heart"),
        Reason(13, "The little notes you leave for me"),
        Reason(14, "How safe I feel when I am with you"),
    )

    val surprises = listOf(
        SurpriseChoice(
            id = 1,
            title = "Spa Night",
            description = "A relaxing at-home spa evening with candles, massages, and face masks",
            emoji = "\uD83D\uDEC1"
        ),
        SurpriseChoice(
            id = 2,
            title = "Dream Dinner",
            description = "A fancy dinner date at any restaurant you choose — my treat",
            emoji = "\uD83C\uDF7D\uFE0F"
        ),
        SurpriseChoice(
            id = 3,
            title = "Adventure Day",
            description = "A full day out doing something we have never tried before",
            emoji = "\uD83C\uDF1F"
        ),
    )

    val loveLetter = """
My dearest,

From the moment you walked into my life, everything changed. The world became brighter, the days became warmer, and my heart found its home.

You have this incredible way of making me feel like I am the luckiest person alive. Your laugh is my favorite sound. Your smile is my favorite sight. And being with you is my favorite place to be.

I want you to know that I see you — all of you. The way you care so deeply, the way you never give up, the way you love with your whole heart. You inspire me every single day.

Thank you for choosing me. Thank you for loving me. Thank you for being exactly who you are.

I love you more than words could ever say, but I will never stop trying to show you.

Forever and always yours
    """.trimIndent()

    val photoCompliments = listOf(
        MediaCompliment.Photo(
            imageResId = R.drawable.top_tier_pic,
            compliment = "This is one of my favorite pictures of you. You look absolutely stunning."
        ),
        MediaCompliment.Photo(
            imageResId = R.drawable.bday_pose,
            compliment = "Every time I see this photo, I fall in love with you all over again."
        ),
        MediaCompliment.Photo(
            imageResId = R.drawable.posing_up,
            compliment = "You have no idea how beautiful you are, and that makes it even better."
        ),
        MediaCompliment.Photo(
            imageResId = R.drawable.best_night_of_her_life,
            compliment = "I love this one so much. You were glowing."
        ),
        MediaCompliment.Photo(
            imageResId = R.drawable.sea_food_date,
            compliment = "One of my favorite dates with you. More of these, please."
        ),
        MediaCompliment.Photo(
            imageResId = R.drawable.always_sleeping,
            compliment = "Even like this, you are the most adorable person I have ever seen."
        ),
        MediaCompliment.Photo(
            imageResId = R.drawable.sleeping_again,
            compliment = "I could watch you sleep forever. You look so peaceful."
        ),
        MediaCompliment.Video(
            videoResId = R.raw.gutter_baaaall,
            compliment = "This little moment with you is everything."
        ),
        MediaCompliment.Video(
            videoResId = R.raw.dope_bowling_alley_vid,
            compliment = "I love how happy you look here."
        ),
        MediaCompliment.Video(
            videoResId = R.raw.wining,
            compliment = "I keep coming back to this one. You are so beautiful."
        ),
        MediaCompliment.Video(
            videoResId = R.raw.bae_eating_spicy_bulgogi,
            compliment = "This is one of my all-time favorite memories with you."
        ),
        MediaCompliment.Video(
            videoResId = R.raw.movie_night,
            compliment = "You make even the ordinary moments feel like magic."
        ),
    )

    val funFacts = listOf(
        FunFact(
            question = "What was the first thing I ever said to you?",
            answer = "\"Is this seat taken?\" — and the rest is history."
        ),
        FunFact(
            question = "What is our most-ordered meal together?",
            answer = "Pizza with extra cheese. Every. Single. Time."
        ),
        FunFact(
            question = "How many days have we been together?",
            answer = "Every one of them has been the best day of my life."
        ),
        FunFact(
            question = "What song reminds me of you?",
            answer = "All of them. But especially our song — you know the one."
        ),
        FunFact(
            question = "When did I know I loved you?",
            answer = "Honestly? Probably before I even realized it myself."
        ),
    )

    val memories = listOf(
        Memory(
            date = "January 15, 2023",
            title = "The Day We Met",
            description = "I saw you across the room and knew my life was about to change forever."
        ),
        Memory(
            date = "February 14, 2023",
            title = "Our First Valentine's Day",
            description = "That tiny restaurant, the candlelight, and your beautiful smile."
        ),
        Memory(
            date = "June 20, 2023",
            title = "Summer Road Trip",
            description = "Windows down, music up, and nowhere to be but together."
        ),
        Memory(
            date = "October 31, 2023",
            title = "Matching Halloween Costumes",
            description = "We were the best-dressed couple at the party and you know it."
        ),
        Memory(
            date = "December 25, 2023",
            title = "First Christmas Together",
            description = "Exchanging gifts by the tree, hot cocoa, and your head on my shoulder."
        ),
        Memory(
            date = "February 14, 2024",
            title = "Happy Valentine's Day",
            description = "Another year of loving you, and I would not trade it for anything in the world."
        ),
    )
}
