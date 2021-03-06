(defproject address-assignment "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [clj-time "0.15.2"],
                 [ring "1.8.0"]
                 [compojure "1.6.1"]
                 [cheshire "5.9.0"]
                 [ring/ring-json "0.5.0"]
                 [ring/ring-defaults "0.3.2"]]
  :plugins [[lein-pprint "1.2.0"]]
  :repl-options {:init-ns address-assignment.core})
