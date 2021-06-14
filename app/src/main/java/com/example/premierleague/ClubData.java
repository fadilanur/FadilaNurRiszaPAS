package com.example.premierleague;

import java.util.ArrayList;

public class ClubData {
    private static String[] clubName = {
            "Arsenal",
            "Aston Villa",
            "Brighton & Hove Albion",
            "Burnley",
            "Chelsea",
            "Crystal Palace",
            "Everton",
            "Fulham",
            "Leeds United",
            "Leicester City",
            "Liverpool",
            "Manchester city",
            "Manchester United",
            "Newcastle United",
            "Sheffield United",
            "Southampton",
            "Tottenham Hotspur",
            "West Bromwich Albion",
            "West Ham United FC",
            "Wolverhampton Wanderers"
    };

    private static String[] clubDetail = {
            "Arsenal Football Club adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. Didirikan pada 1886 dengan nama Dial Square.",
            "Aston Villa Football Club adalah klub sepak bola profesional yang bermarkas di Villa Park, Birmingham, Inggris.",
            "Brighton & Hove Albion Football Club, biasa disebut Brighton atau Seagulls, adalah klub sepakbola profesional Inggris yang berbasis di kota Brighton.",
            "Burnley Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Burnley, Lancashire. Klub ini sedang bermain di Liga Utama Inggris.",
            "Chelsea Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris.",
            "Crystal Palace Football Club merupakan sebuah tim sepak bola Inggris yang bermarkas di London Borough of Croydon dan didirikan pada tahun 1905.",
            "Everton Football Club atau yang biasa disebut Everton adalah klub Liga Premier Inggris yang berbasis di Merseyside, Liverpool. Berdiri sejak 1878.",
            "Fulham Football Club adalah sebuah klub sepak bola Inggris yang didirikan pada tahun 1879. Klub ini bermarkas di daerah Fulham, London dan berkompetisi di Liga Utama Inggris.",
            "Leeds United Football Club adalah sebuah klub sepak bola asal Inggris yang berbasis di Beeston, Leeds, West Yorkshire. Pada akhir musim 2019–20, mereka mampu menjadi juara Kejuaraan EFL.",
            "Leicester City Football Club pernah menorehkan tinta emas di kompetesi Premier League, Inggris. Tim berjulukan Rubah Biru ini berhasil menjadi kampiun di musim 2015/16.",
            "Liverpool Football Club adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool. Saat ini Liverpool adalah peserta Liga Utama Inggris.",
            "Manchester City Football Club adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris.",
            "Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris.",
            "Newcastle United Football Club adalah klub sepak bola profesional Inggris yang berbasis di Newcastle upon Tyne, dan bermain di Liga Utama Inggris, kompetisi tingkat teratas dalam sepak bola Inggris.",
            "Sheffield United Football Club adalah sebuah tim sepak bola profesional Inggris yang bermarkas di kota Sheffield, Yorkshire Selatan, Inggris. Tim ini dibentuk tahun 1889 .",
            "Southampton Football Club merupakan sebuah tim sepak bola Inggris yang didirikan tahun 1898. Bermarkas di Stadion St Mary's, Southampton, Hampshire, Southampton.",
            "Tottenham Hotspur Football Club adalah klub sepak bola di London utara. Mereka juga dikenal sebagai Spurs, The Spurs dan Tottenham.",
            "West Bromwich Albion Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di West Bromwich, West Midlands. Didirikan pada tahun 1878. Sejak tahun 1900.",
            "West Ham United Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di London. Sejak 2016, klub ini memainkan pertandingan kandangnya di London Stadium yang berkapasitas 80.000 kursi.",
            "Wolverhampton Wanderers Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Wolverhampton, Britania Raya yang bermain di Liga Utama Inggris.",
    };

    private static int[] clubImage = {
            R.drawable.arsenal,
            R.drawable.astonvilla,
            R.drawable.brighton,
            R.drawable.burnley,
            R.drawable.chelsea,
            R.drawable.crystal,
            R.drawable.everton,
            R.drawable.fulham,
            R.drawable.leeds,
            R.drawable.leicester,
            R.drawable.liverpool,
            R.drawable.mancity,
            R.drawable.manunid,
            R.drawable.newcastle,
            R.drawable.shaffied,
            R.drawable.southampton,
            R.drawable.tottenham,
            R.drawable.wba,
            R.drawable.westham,
            R.drawable.wolverhamthon,

    };
    static ArrayList<Club> getListData() {
        ArrayList<Club> list = new ArrayList<>();
        for (int position = 0; position < clubName.length; position++) {
            Club club = new Club();
            club.setName(clubName[position]);
            club.setDetail(clubDetail[position]);
            club.setPhoto(clubImage[position]);
            list.add(club);
        }
        return list;
    }
}