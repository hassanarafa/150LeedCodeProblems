package org.example;

import java.util.ArrayList;
import java.util.List;

public class ReplaceWords {
    public static String replaceWords(List<String> dictionary, String sentence) {
        var x = new StringBuilder();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {
            while (i < sentence.length() - 1 && sentence.charAt(i) != ' ') {
                x.append(sentence.charAt(i));
                i++;
            }
            if (i == sentence.length() - 1) {
                x.append(sentence.charAt(sentence.length() - 1));
            }
            words.add(x.toString());
            x = new StringBuilder();
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            for (String s : dictionary) {
                if (words.get(i).startsWith(s)) {
                    words.set(i, s);
                }
            }
            result.append(words.get(i));
            if (i != words.size() - 1)
                result.append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] x = {"e", "k", "c", "harqp", "h", "gsafc", "vn", "lqp", "soy"
                , "mr", "x", "iitgm", "sb", "oo", "spj", "gwmly", "iu", "z", "f", "ha", "vds", "v", "vpx"
                , "fir", "t", "xo", "apifm", "tlznm", "kkv", "nxyud", "j", "qp", "omn", "zoxp", "mutu"
                , "i", "nxth", "dwuer", "sadl", "pv", "w", "mding", "mubem", "xsmwc", "vl", "farov",
                "twfmq", "ljhmr", "q", "bbzs", "kd", "kwc", "a", "buq", "sm", "yi", "nypa", "xwz", "si",
                "amqx", "iy", "eb", "qvgt", "twy", "rf", "dc", "utt", "mxjfu", "hm", "trz", "lzh", "lref"
                , "qbx", "fmemr", "gil", "go", "qggh", "uud", "trnhf", "gels", "dfdq", "qzkx", "qxw"};
        System.out.println(replaceWords(List.of(x), "ikkbp miszkays wqjferqoxjwvbieyk gvcfldkiavww " +
                "vhokchxz dvypwyb bxahfzcfanteibiltins ueebf lqhflvwxksi dco" +
                " kddxmckhvqifbuzkhstp wc ytzzlm gximjuhzfdjuamhsu gdkbmhpnvy " +
                "ifvifheoxqlbosfww mengfdydekwttkhbzenk wjhmmyltmeufqvcpcxg " +
                "hthcuovils ldipovluo aiprogn nusquzpmnogtjkklfhta klxvvlvyh " +
                "nxzgnrveghc mpppfhzjkbucv cqcft uwmahhqradjtf iaaasabqqzmbcig " +
                "zcpvpyypsmodtoiif qjuiqtfhzcpnmtk yzfragcextvx ivnvgkaqs iplazv " +
                "jurtsyh gzixfeugj rnukjgtjpim hscyhgoru aledyrmzwhsz xbahcwfwm hzd " +
                "ygelddphxnbh rvjxtlqfnlmwdoezh zawfkko iwhkcddxgpqtdrjrcv bbfj " +
                "mhs nenrqfkbf spfpazr wrkjiwyf cw dtd cqibzmuuhukwylrnld " +
                "dtaxhddidfwqs bgnnoxgyynol hg dijhrrpnwjlju muzzrrsypzgwvblf " +
                "zbugltrnyzbg hktdviastoireyiqf qvufxgcixvhrjqtna ipfzhuvgo daee r" +
                " nlipyfszvxlwqw yoq dewpgtcrzausqwhh qzsaobsghgm ichlpsjlsrwzhbyfhm" +
                " ksenb bqprarpgnyemzwifqzz oai pnqottd nygesjtlpala qmxixtooxtbrzyorn " +
                "gyvukjpc s mxhlkdaycskj uvwmerplaibeknltuvd ocnn frotscysdyclrc " +
                "ckcttaceuuxzcghw pxbd oklwhcppuziixpvihihp"));

    }
}
