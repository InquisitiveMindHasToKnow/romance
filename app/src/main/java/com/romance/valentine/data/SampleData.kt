package com.romance.valentine.data

import com.romance.valentine.R

object SampleData {

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
