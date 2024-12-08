class Art {
    public static void main(String[] args) {
        String ART =
                """
                                ********         *********                                    ***********
                               ********         **********                                    ***********
                              ********         ***********                                    ***********
                             ********         ************                                    ***********
                            ********         ****** ******                                      ******* \s
                           ********         ******  ******                                      ******* \s
                          ********         ******   ******                                      ******* \s
                         **************   ******************                                    ******* \s
                        ***************** ******************                                    ****** \s
                        ************************************                        *******     ******* \s
                        *******     *******         ******                          *******     ******* \s
                        *******     *******         ******                          ********   ******** \s
                        *******************         ******                          ******************* \s
                         *****************        **********                         *****************  \s
                           *************          **********                           *************    \s
                             *********            **********                             *********      \s
                                                            ________________________                    \s
                                                            ************************                    \s
                                                            ________________________""";



        String name_list = "MARJAN SHOHAN SANTA NAHIDA NISHA TITHI TRINA TONNI SAMIA SABIR ARIFUL RAMJAN NAIMUL SAJIDUL SAYEM RAKIB ANONNYA PROTTOY NOYON NEAMAT SRABON VASKAR SNINGDHO RIDI AKIB KONGKONA ZITU DIPTO ALVI PHAIRUSE EMON MASUM YEYA RAHAT ALIM FAHIM MAWA JIHAD NIRBOB NAFISA SABIT SHAKIL TANSIR ALIF HRIDOY ARIFUL DIPJOY";
        int index = 0;

        char[] art_array = ART.toCharArray();

        for (int i = 0; i < art_array.length; i++) {
            char c = art_array[i];

            if (c == '*') {
                art_array[i] = name_list.charAt(index);
                index++;

                if (index >= name_list.length()) {
                    index = 0;
                }
            }
        }

        for (char c : art_array) {
            System.out.print(c);
        }
    }
}
