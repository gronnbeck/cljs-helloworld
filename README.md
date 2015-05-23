# cljs-helloworld

Getting started with cljs following a two step guide
[here](http://www.mase.io/code/clojure/node/2015/01/24/getting-started-with-clojurecript-and-node/)
and
[here](http://www.mase.io/code/clojure/node/2015/01/25/clojurescript-and-node-part-2-express/)

Later on this project can be used as a template for getting started with
cljs development.

## Deploy to heroku

```sh
heroku login
heroku create
heroku buildpacks:set git://github.com/heroku/heroku-buildpack-clojure.git
heroku buildpacks:add https://github.com/heroku/heroku-buildpack-nodejs.git
heroku config:add LEIN_BUILD_TASK="cljsbuild"
git push heroku master
heroku ps:scale web=1
heroku open
```
