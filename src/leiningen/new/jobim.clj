(ns leiningen.new.jobim
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "jobim"))

(defn jobim
  "Creates a fresh jobim project"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' jobim project.")
    (->files data
             ["src/{{sanitized}}/show.clj" (render "show.clj" data)]
             ["test/{{sanitized}}/show-test.clj" (render "show-test.clj" data)]
             ["project.clj" (render "project.clj" data)]
             ["resources/public/js/highlight.pack.js" (render "highlight.pack.js" data)]
             ["resources/public/css/railscasts.css" (render "railscasts.css" data)]
             ["resources/public/index.html" (render "index.html" data)]
             ["resources/public/min.html" (render "min.html" data)]
             ["README.md" (render "README.md" data)]
             ["LICENSE" (render "LICENSE" data)])))
