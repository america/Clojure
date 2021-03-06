(defproject sample "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.5.1"]
                 [cheshire "5.0.1"]
                 [org.scala-lang/scala-library "2.9.1"]
                 [robert/hooke "1.3.0"]
                 ; colors in your REPL
                 [colorize "0.1.1" :exclusions [[org.clojure/clojure]]]
                 [json-path "0.2.0"]
                 [clj-ldap "0.0.4"]
                 [net.mikera/clisk "0.7.0"]
                 [incanter "1.3.0"]
                 [com.novemberain/monger "1.4.2"]
                 ]
  :profiles {:dev {:dependencies [
                                  [com.cemerick/pomegranate "0.0.13"]
                                  [midje "1.5.1"]
                                  ]
                   }}
  :plugins [[lein-scalac "0.1.0"]]
  :scala-source-path "src/scala"
  :prep-tasks ["scalac" "javac"]
  ; javaのクラスへのパス
  :java-source-paths ["src/java"]
  ; javacのコンパイルオプション
  :javac-opts ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  
  )
  
