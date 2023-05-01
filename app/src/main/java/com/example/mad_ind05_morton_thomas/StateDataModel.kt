package layout

import java.util.*

object StateDataModel {
    val statesAreas: Dictionary<String, String> = Hashtable<String, String>().apply {
        put("Alaska", "665384")
        put("Texas", "268596")
        put("California", "163696")
        put("Montana", "147039")
        put("New Mexico", "121590")
        put("Arizona", "113990")
        put("Nevada", "110571")
        put("Colorado", "104093")
        put("Oregon", "98378")
        put("Wyoming", "97813")
        put("Michigan", "96716")
        put("Minnesota", "86935")
        put("Utah", "84899")
        put("Idaho", "83569")
        put("Kansas", "82278")
        put("Nebraska", "77354")
        put("South Dakota", "77116")
        put("Washington", "71362")
        put("North Dakota", "70698")
        put("Oklahoma", "69899")
        put("Missouri", "69702")
        put("Florida", "65758")
        put("Wisconsin", "65496")
        put("Georgia", "59425")
        put("Illinois", "57915")
        put("Iowa", "56272")
        put("New York", "54556")
        put("North Carolina", "53819")
        put("Arkansas", "53179")
        put("Alabama", "52420")
        put("Louisiana", "52378")
        put("Mississippi", "48431")
        put("Pennsylvania", "46054")
        put("Ohio", "44825")
        put("Virginia", "42774")
        put("Tennessee", "42143")
        put("Kentucky", "40408")
        put("Indiana", "36418")
        put("Maine", "35385")
        put("South Carolina", "32020")
        put("West Virginia", "24230")
        put("Maryland", "12407")
        put("Hawaii", "10931")
        put("Massachusetts", "10554")
        put("Vermont", "9616")
        put("New Hampshire", "9349")
        put("New Jersey", "8722")
        put("Connecticut", "5543")
        put("Delaware", "1949")
        put("Rhode Island", "1033")
    }

    val statesCollection = listOf<State>(
        State("Alabama", "The Yellowhammer State"),
        State("Alaska", "The Last Frontier"),
        State("Arizona", "The Grand Canyon State"),
        State("Arkansas", "The Natural State"),
        State("California", "The Golden State"),
        State("Colorado", "The Centennial State"),
        State("Connecticut", "The Constitution State"),
        State("Delaware", "The First State"),
        State("Florida", "The Sunshine State"),
        State("Georgia", "The Peach State"),
        State("Hawaii", "The Aloha State"),
        State("Idaho", "The Gem State"),
        State("Illinois", "The Prairie State"),
        State("Indiana", "The Hoosier State"),
        State("Iowa", "The Hawkeye State"),
        State("Kansas", "The Sunflower State"),
        State("Kentucky", "The Bluegrass State"),
        State("Louisiana", "The Pelican State"),
        State("Maine", "The Pine Tree State"),
        State("Maryland", "The Old Line State"),
        State("Massachusetts", "The Bay State"),
        State("Michigan", "The Great Lakes State"),
        State("Minnesota", "The North Star State"),
        State("Mississippi", "The Magnolia State"),
        State("Missouri", "The Show-Me State"),
        State("Montana", "The Treasure State"),
        State("Nebraska", "The Cornhusker State"),
        State("Nevada", "The Silver State"),
        State("New Hampshire", "The Granite State"),
        State("New Jersey", "The Garden State"),
        State("New Mexico", "The Land of Enchantment"),
        State("New York", "The Empire State"),
        State("North Carolina", "The Tar Heel State"),
        State("North Dakota", "The Peace Garden State"),
        State("Ohio", "The Buckeye State"),
        State("Oklahoma", "The Sooner State"),
        State("Oregon", "The Beaver State"),
        State("Pennsylvania", "The Keystone State"),
        State("Rhode Island", "The Ocean State"),
        State("South Carolina", "The Palmetto State"),
        State("South Dakota", "The Mount Rushmore State"),
        State("Tennessee", "The Volunteer State"),
        State("Texas", "The Lone Star State"),
        State("Utah", "The Beehive State"),
        State("Vermont", "The Green Mountain State"),
        State("Virginia", "The Old Dominion"),
        State("Washington", "The Evergreen State"),
        State("West Virginia", "The Mountain State"),
        State("Wisconsin", "The Badger State"),
        State("Wyoming", "The Equality State")
    )
}