package com.baleit.footballmatchschedule.item

import com.google.gson.annotations.SerializedName

data class MatchItems(

        @SerializedName("idEvent") var eventId: String? = null,
        @SerializedName("idHomeTeam") var homeTeamId: String? = null,
        @SerializedName("idAwayTeam") var awayTeamId: String? = null,

        @SerializedName("strDate") var dateMatch: String? = null,
        @SerializedName("strHomeTeam") var teamHome: String? = null,
        @SerializedName("strAwayTeam") var teamAway: String? = null,
        @SerializedName("intHomeScore") var scoreHome: String? = null,
        @SerializedName("intAwayScore") var scoreAway: String? = null

)