(defproject jsx-fun "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3165" :exclusions
                  [com.google.javascript/closure-compiler]]
                 [com.google.javascript/closure-compiler "1.0-SNAPSHOT"]
                 [com.facebook/jsx "0.13.1"]]
  :plugins [[cider/cider-nrepl "0.8.2"]])
