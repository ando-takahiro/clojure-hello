(ns my-stuff.core
  (:gen-class))

;(defn -main
;  "I don't do a whole lot ... yet."
;  [& args]
;  (println "Hello, World!"))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain; charset=UTF-8"}
   :body (str "Hello World. 日本語テスト It is now " (java.util.Date.))})
