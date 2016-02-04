@PLUGIN@ Configuration
======================

The following options can be configured in `etc/gerrit.config`

[[plugin "lfs-storage-s3"]]
=== Section plugin.lfs-storage-s3

[[plugin.lfs-storage-s3.region]]plugin.lfs-storage-s3.region::
+
link:http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions
[Amazon region] the S3 storage bucket is residing in.

[[plugin.lfs-storage-s3.bucket]]plugin.lfs-storage-s3.bucket::
+
Name of the link:http://docs.aws.amazon.com/AmazonS3/latest/UG/CreatingaBucket.html
[Amazon S3 storage bucket] which will store large objects.

[[plugin.lfs-storage-s3.storageClass]]plugin.lfs-storage-s3.storageClass::
+
link:http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html
[Amazon S3 storage class] used for storing large objects.
+
Default is `REDUCED_REDUNDANCY`

[[plugin.lfs-storage-s3.expiration]]plugin.lfs-storage-s3.expiration::
+
Expiration in seconds of validity of signed requests. Gerrit's LFS protocol
handler signs requests to be issued by the git-lfs extension with the configured
`accessKey` and `secretKey`. This way the git-lfs extension doesn't need
any credentials to access objects in the S3 bucket. Validity of these request
signatures expires after this period.
+
Default is `60` seconds.

[[plugin.lfs-storage-s3.disableSslVerify]]plugin.lfs-storage-s3.disableSslVerify::
+
`true`: SSL verification is disabled
+
`false`: SSL verification is enabled
+
Default is `false`.

----
The following options can be configured in `etc/secure.config`

[[plugin.lfs-storage-s3.accessKey]]plugin.lfs-storage-s3.accessKey::
+
The link:http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html
[Amazon IAM accessKey] for authenticating to S3.

[[plugin.lfs-storage-s3.secretKey]]plugin.lfs-storage-s3.secretKey::
+
The link:http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html
[Amazon IAM secretKey] for authenticating to S3.
