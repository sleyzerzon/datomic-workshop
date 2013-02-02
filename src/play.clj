(use 'cms.datomic.core)

(init)

(cms.data/setup)

(require '[cms.domain.author :as au]
         '[cms.domain.article :as ar]
         '[cms.domain.tag :as t]
         '[datomic.api :as api])

(pprint (au/find-all))