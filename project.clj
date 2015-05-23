(defproject cljs-helloworld "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.7.0-beta2"]
                 [org.clojure/clojurescript "0.0-3269"]]

  :node-dependencies [[source-map-support "0.2.8"]
                      [express "4.11.1"]]

  :plugins [[lein-cljsbuild "1.0.4"]
            [lein-npm "0.4.0"]]

  :source-paths ["src" "target/classes"]

  :clean-targets ["out/server/helloworld" "out/server/helloworld.js"]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src/server"]
              :compiler {
                :main cljs-helloworld.core
                :output-to "out/server/helloworld.js"
                :output-dir "out/server"
                :optimizations :none
                :target :nodejs
                :cache-analysis true
                :source-map true}}
            ]})
