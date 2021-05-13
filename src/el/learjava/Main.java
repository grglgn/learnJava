package el.learjava;

import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(List.of("s1", "s2", "s3", "s4"));
        //List<String> list2 = List.copyOf(List.of("s1", "s2", "s3", "s4"));
        d("before:" + list2);
        addObj("new", list2);
        d("after:" + list2);
        d("stream");
        list2.stream().forEach(item-> d(item));

        Path pat = Path.of("c:", "\\Users\\grglgn\\Documents\\Вера\\");
                d("can read:"+pat.toFile().canRead());
        //System.getSecurityManager().checkWrite(FileDescriptor.pat.toFile().);
        try {
            Files.lines(pat).
                    forEach(Main::d);
        }catch(IOException io){
            io.printStackTrace();
        }
    }

    private static void d(String s) {
        System.out.println(s);
    }

    static <T> List<T> addObj(T param, List<T> list) {
        list.add(param);
        return list;
    }
}
