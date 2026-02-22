package com.romance.valentine.data

import com.romance.valentine.R

object ValentineData {

    val loveNotes = listOf(
        LoveNote("Every love story is beautiful, but ours is my favorite."),
        LoveNote("I fell in love with you because of a million tiny things you never knew you were doing."),
        LoveNote("I love you a little more each and every day."),
        LoveNote("You make even ordinary days feel magical."),
        LoveNote("I love you not because of who you are, but because of who I am when I am with you."),
        LoveNote("You make my heart smile."),
        LoveNote("Just thinking about you puts a smile on my face."),
        LoveNote("My favorite place in the world is next to you."),
        LoveNote("I love you more than cooked food, and that is saying a lot!"),
        LoveNote("A million kisses to the most amazing woman I know."),
        LoveNote("If I had a flower for every time you made me smile, I'd have a garden to walk in forever."),
        LoveNote("The more years go by, the more I learn new things to love about you. You are the most amazing woman to me."),
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
        Reason(10, "The way you say my name ;)"),
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
Babeh. La Reina Toxica,

From the moment you walked into my life, everything changed. The world became brighter, the days became warmer, and my heart found its home.
You have this incredible way of making me feel like I am the luckiest person alive. Your laugh is my favorite sound. Your smile is my favorite sight. And being with you is my favorite place to be.
I want you to know that I see you, all of you. The way you care so deeply, the way you never give up, the way you love with your whole heart. You inspire me every single day.
Thank you for choosing me. Thank you for loving me. Thank you for being exactly who you are.
I love you more than words could ever say, but I will never stop trying to show you.

    """.trimIndent()

    val photoCompliments = listOf(
        MediaCompliment.Photo(
            imageResId = R.drawable.top_tier_pic,
            compliment = "This is one of my favorite pictures of you. You look absolutely stunning."
        ),
        MediaCompliment.Photo(
            imageResId = R.drawable.bday_pose,
            compliment = "Straight outta my twenties and into them...\uD83D\uDE09"
        ),
        MediaCompliment.Photo(
            imageResId = R.drawable.posing_up,
            compliment = "You have no idea how beautiful you are, and that makes it even better."
        ),
        MediaCompliment.Photo(
            imageResId = R.drawable.best_night_of_her_life,
            compliment = "I love this one so much. You were glowing. #1Sk8erGirl!"
        ),
        MediaCompliment.Photo(
            imageResId = R.drawable.sea_food_date,
            compliment = "One of my favorite dates with you. More of these, please...with some steak!"
        ),
        MediaCompliment.Photo(
            imageResId = R.drawable.always_sleeping,
            compliment = "Even like this, you are the most adorable person I have ever seen."
        ),
        MediaCompliment.Photo(
            imageResId = R.drawable.sleeping_again,
            compliment = "Sleeping as always. Thank goodness I'm not this bad!"
        ),
        MediaCompliment.Video(
            videoResId = R.raw.gutter_baaaall,
            compliment = "And to think you laughed at my dancing skills! The nerve! \uD83D\uDE02"
        ),
        MediaCompliment.Video(
            videoResId = R.raw.dope_bowling_alley_vid,
            compliment = "I mean, you read the mug!\uD83D\uDE09"
        ),
        MediaCompliment.Video(
            videoResId = R.raw.wining,
            compliment = "It's Labor Day Mondaaaaaayyyy!"
        ),
        MediaCompliment.Video(
            videoResId = R.raw.bae_eating_spicy_bulgogi,
            compliment = "This is one of my all time favorite memories with you. #Raymonding"
        ),
        MediaCompliment.Video(
            videoResId = R.raw.movie_night,
            compliment = "You make even the ordinary moments feel like magic."
        ),
    )

    val funFacts = listOf(
        FunFact(
            question = "What's a trip I want to take with you?",
            answer = "Anywhere. Genuinely anywhere. You make the destination irrelevant. Europe is sounding nice, though."
        ),
        FunFact(
            question = "What is our most ordered meal together?",
            answer = "Bruh. Pho. 1000% Pho! Or Phuh? Fuh? You know? The soup!"
        ),
        FunFact(
            question = "What do you think of when you hear \"Wild\" by John Legend?",
            answer = "Mhm. Yea, me, too. Freka!"
        ),
        FunFact(
            question = "What's something you've changed about me?",
            answer = "Honestly? I've tried new foods I would not have given a second look to. You did that! lol "
        ),
        FunFact(
            question = "What's something about our relationship I'm proudest of?",
            answer = "That we actually talk. Like really talk. "
        ),
        FunFact(
            question = "What's something I hope we never lose?",
            answer = "The way we still genuinely like each other. And may the goofiness never change!"
        ),
        FunFact(
            question = "What's something about you that still surprises me?",
            answer = "That you're an even bigger nerd than I thought."
        ),
        FunFact(
            question = "What's my favorite time of day with you?",
            answer = "Late night, when it's just us and there's nothing left to do...but us."
        ),
        FunFact(
            question = "What's a promise I quietly made to you?",
            answer = "To keep showing up, even when it's hard."
        ),
        FunFact(
            question = "What's something I'd do over just to experience again?",
            answer = "Meeting you for the first time, knowing what I know now."
        ),
        FunFact(
            question = "What do I want you to feel every single day?",
            answer = "Like you were chosen. Because you were."
        ),
        FunFact(
            question = "What's my favorite video of us?",
            answer = "The candid one. The one where you were laying on the couch at 104. Jogs your memory? ;) "
        )
    )

    val promises = listOf(
        Promise(label = "Safety", text = "I promise to always be your safe place, no matter what."),
        Promise(label = "Devotion", text = "I promise to choose you, every single day, without hesitation."),
        Promise(label = "Laughter", text = "I promise to make you laugh even on your hardest days."),
        Promise(label = "Support", text = "I promise to support every dream you have, big or small."),
        Promise(label = "Love", text = "I promise to never stop showing you how much you mean to me."),
        Promise(label = "Presence", text = "I promise to be patient, kind, and present — always."),
        Promise(label = "Growth", text = "I promise to grow with you, not just alongside you."),
    )
}
