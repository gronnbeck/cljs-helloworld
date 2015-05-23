(ns cljs-helloworld.core
  (:require [cljs.nodejs :as node]))

(node/enable-util-print!)

(def express (node/require "express"))

(defn say-hello! [req res]
  (.send res "Hello world!"))

(defn -main []
  (let [app (express)]
    (.get app "/" say-hello!)
    (.listen app (-> node/process.env.PORT) (fn []
                        (println "Server started on port 3000")))))

(set! *main-cli-fn* -main)
