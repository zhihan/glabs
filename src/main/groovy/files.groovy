package me.zhihan.glabs

import groovy.json.JsonSlurper

import java.net.URL
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths 
import java.util.List

class FileReadMain{
    static void mainJson() {
        URL url = ClassLoader.getSystemClassLoader().getResource("test.json")
        Map json = new JsonSlurper().parse(url, "utf-8")
        json.each { k, v ->
            println("$k : $v")
        }
      
    }
    static void main (String[] args) {
        URL url = ClassLoader.getSystemClassLoader().getResource("test.txt")
        File file = new File(url.toURI())
        Path path = file.toPath()
        Charset cs = Charset.forName("utf-8")
        List lines = Files.readAllLines(path, cs)

        for (l in lines) {
            println(l)
        }
        mainJson()
    }
}
