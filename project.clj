(defproject incanter-demo "0.1.0-SNAPSHOT"
  :description "Demo project for time series analysis with Incanter"
  :url "https://github.com/chrisoei/incanter-demo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.c-oei/stardate "5.0.0-SNAPSHOT"]
                 [incanter "1.9.1"]]
  :repl-options {:init-ns incanter-demo.core})
