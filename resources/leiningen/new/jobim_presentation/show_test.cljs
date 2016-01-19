(ns {{name}}.show-test
  (:require [cljs.test :refer-macros [deftest is run-tests]]
            [jobim.figwheel.helper]
            [{{name}}.show :as show]))

(deftest code-slide-test
  (testing "write some tests!"
    (is (= 1 2))))

(run-tests)
