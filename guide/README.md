

### Building the Bookbag image

#### Local Docker build

Just run `docker build .` with name/tag information for your image: 

```
$ docker build . -t lbroudoux/adding-security-layers-workshop
```

#### OpenShift build

Once connected onto your OpenShift project, run the following:

```
$ oc process bookbag-template.yml -p NAME=adding-security-layer-workshop -p GIT_REF=completed | oc apply -f -
```

Use the `GIT_REF` to switch to different branch. After having finished the build, image is stored into `image-registry.openshift-image-registry.svc:5000/${PROJECT_NAME}/adding-security-layer-workshop` ImageStream.

### Deploying the Bookbag image

To deploy a Bookbag with lab instructions on an OpenShift project:

```
$ oc process bookbag-template.yml -p NAME=adding-security-layer-workshop -p IMAGE=image-registry.openshift-image-registry.svc:5000/${PROJECT_NAME}/adding-security-layer-workshop | oc apply -f -
```

Once deployed you should have a `Route` you can retrieve using `oc get routes`. Just open the URL into your browser.


-------

The code here is derived from https://github.com/openshift-homeroom. 