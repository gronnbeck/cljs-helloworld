(ns cljs-helloworld.core
  (:require [clojure.browser.repl :as repl]))

;; (repl/connect "http://localhost:9000/repl")

(enable-console-print!)

(defn -main []
  (println "Hello world!"))

(set! *main-cli-fn* -main)
