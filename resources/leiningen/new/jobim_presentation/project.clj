(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME"
  :url "FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.170"]
                 [org.clojure/core.async "0.2.374"]
                 [reagent "0.5.0"]
                 [fipp "0.6.4"]
                 [org.clojars.mysterysal/jobim "1.0.0"]
                 [org.clojars.mysterysal/jobim-figwheel "0.1.0"]]

  :plugins [[lein-cljsbuild "1.1.1"]
            [lein-figwheel "0.5.0"]]

  :source-paths ["src"]

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]

  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src" "test"]
                :figwheel true
                :compiler {:output-to "resources/public/js/compiled/show.js"
                           :output-dir "resources/public/js/compiled/out"
                           :asset-path "js/compiled/out"
                           :main {{name}}.show-test
                           :source-map true
                           :cache-analysis true}}
               {:id "min"
                :source-paths ["src"]
                :compiler {:output-to "resources/public/js/compiled/show.min.js"
                           :main {{name}}.show
                           :optimizations :none
                           :pretty-print false}}]}

  :figwheel {:css-dirs ["resources/public/css"]})
